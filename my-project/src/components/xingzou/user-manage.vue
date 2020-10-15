<template>
  <div class="user-container">
    <div class="search-box">
      <el-form :model="searchFormData" ref="form" label-width="80px" inline>
        <el-form-item label="用户名" prop="userName">
          <el-input
            v-model="searchFormData.userName"
            @keyup.native.enter="fetch"
            placeholder="请输入用户名"
          ></el-input>
        </el-form-item>
        <el-form-item label="用户账号" prop="userAccount">
          <el-input
            v-model="searchFormData.userAccount"
            @keyup.native.enter="fetch"
            placeholder="请输入用户账号"
          ></el-input>
        </el-form-item>
        <el-form-item label="角色" prop="role">
          <el-select v-model="searchFormData.role">
            <el-option label="管理员" value="1"></el-option>
            <el-option label="店长" value="2"></el-option>
            <el-option label="司机" value="3"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="fetch">查询</el-button>
          <el-button type="primary" @click="reset">重置</el-button>
        </el-form-item>
      </el-form>
    </div>

    <div class="btn-group">
      <el-button>新增</el-button>
      <el-button>修改</el-button>
      <el-button @click="deleteRows">删除</el-button>
    </div>

    <el-table :data="tableData" @selection-change="selectionChange">
      <el-table-column type="selection"></el-table-column>
      <el-table-column label="账号" prop="account"></el-table-column>
      <el-table-column label="姓名" prop="name"></el-table-column>
      <el-table-column label="角色" prop="role">
        <template slot-scope="scope">
          <span>{{
            scope.row.role === "1"
              ? "管理员"
              : scope.row.role === "2"
              ? "店长"
              : "司机"
          }}</span>
        </template>
      </el-table-column>
      <el-table-column label="性别" prop="gender"></el-table-column>
      <el-table-column label="手机" prop="phone"></el-table-column>
      <el-table-column label="邮箱" prop="email"></el-table-column>
      <el-table-column label="身份证" prop="idCard"></el-table-column>
    </el-table>

    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="pageInfo.pageIndex"
      :page-sizes="[3, 5, 7]"
      :page-size="pageInfo.pageSize"
      layout="total, sizes, prev, pager, next, jumper"
      :total="pageInfo.total"
    >
    </el-pagination>
  </div>
</template>

<script>
import $ from "jquery";

export default {
  data() {
    return {
      searchFormData: {
        userName: "",
        userAccount: "",
        role: ""
      },
      tableData: [],
      pageInfo: {
        pageIndex: 1,
        pageSize: 3,
        total: 0
      },
      selectionData: []
    };
  },
  mounted() {
    this.search();
  },
  methods: {
    selectionChange(rew) {
      this.selectionData = rew;
      console.log(this.selectionData);
    },
    deleteRows() {
      let ids = this.selectionData.map(e => e.id).toString();
      console.log(ids);
      
      $.ajax({
        url: "http://192.168.3.77:3000/api/demo/delete",
        method: "get",
        data: { ids: ids },
        dataType: "json",
        success: res => {
          console.log(res);
          if (res.data) {
            this.$message({
              type: "success",
              message: res.message
            });

            this.fetch();
          } else {
            this.$message({
              type: "error",
              message: res.message
            });
          }
        }
      });
    },
    fetch() {
      this.pageInfo.pageIndex = 1;
      this.pageInfo.pageSize = 3;

      this.search();
    },
    search() {
      $.ajax({
        url: "http://192.168.3.77:3000/api/demo/searchList",
        method: "get",
        data: Object.assign({}, this.pageInfo, this.searchFormData),
        dataType: "json",
        success: res => {
          console.log(res);
          this.tableData = res.data;
          this.pageInfo.total = res.total;
        }
      });
    },

    reset() {
      this.$refs.form.resetFields();

      this.fetch();
    },
    handleSizeChange(value) {
      console.log("Size:" + value);
      this.pageInfo.pageSize = value;

      this.search();
    },
    handleCurrentChange(value) {
      console.log("Current:" + value);
      this.pageInfo.pageIndex = value;

      this.search();
    }
  }
};
</script>

<style scoped>
.user-container .search-box {
  padding: 10px;
  box-sizing: border-box;
}
</style>
