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
      <el-button @click="add">新增</el-button>
      <el-button @click="upDate">修改</el-button>
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
      :page-sizes="[5, 7, 10]"
      :page-size="pageInfo.pageSize"
      layout="total, sizes, prev, pager, next, jumper"
      :total="pageInfo.total"
    >
    </el-pagination>

    <el-dialog title="提示" :visible.sync="dialogVisible" width="60%">
      <el-form :model="dialogFormData" label-width="80px" ref="dialogForm">
        <el-row>
          <el-col :span="12">
            <el-form-item label="账号" prop="account">
              <el-input v-model="dialogFormData.account"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="姓名" prop="name">
              <el-input v-model="dialogFormData.name"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="5">
            <el-form-item label="性别" prop="gender">
              <el-radio v-model="dialogFormData.gender" label="男">男</el-radio>
              <el-radio v-model="dialogFormData.gender" label="女">女</el-radio>
            </el-form-item>
          </el-col>
          <el-col :span="9">
            <el-form-item label="角色" prop="role">
              <el-select v-model="dialogFormData.role" style="width:100%">
                <el-option label="管理员" value="1"></el-option>
                <el-option label="店长" value="2"></el-option>
                <el-option label="司机" value="3"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="10">
            <el-form-item label="手机" prop="phone">
              <el-input v-model="dialogFormData.phone"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="12">
            <el-form-item label="邮箱" prop="email">
              <el-input v-model="dialogFormData.email"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="身份证" prop="idCard">
              <el-input v-model="dialogFormData.idCard"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="dialogConfirm">
          确 定
        </el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import $ from "jquery";

export default {
  data() {
    return {
      dialogFormData: {},
      dialogVisible: false,

      searchFormData: {
        userName: "",
        userAccount: "",
        role: ""
      },
      tableData: [],
      pageInfo: {
        pageIndex: 1,
        pageSize: 5,
        total: 0
      },
      selectionData: [],
      isap: ""
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

    add() {
      this.isap = "add";
      this.dialogVisible = true;
    },

    upDate() {
      this.isap = "upDate";
      if (this.selectionData.length > 1) {
        this.$message({
          type: "info",
          message: "只能选择一条数据进行更改"
        });
        return;
      }
      if (!this.selectionData.length) {
        this.$message({
          type: "info",
          message: "请选择要更改的数据"
        });
        return;
      }
      this.dialogFormData = Object.assign({}, this.selectionData[0]);
      this.dialogVisible = true;
    },

    dialogConfirm() {
      console.log(this.dialogFormData);
      if (this.isap === "add") {
        $.ajax({
          url: "http://192.168.3.77:3000/api/demo/add",
          method: "post",
          data: this.dialogFormData,
          dataType: "json",
          success: res => {
            console.log(res);
            if (res.data) {
              this.$message({
                type: "success",
                message: res.message
              });

              console.log(this.$refs);
              this.$refs.dialogForm.resetFields();
              this.dialogVisible = false;
              this.fetch();
            } else {
              this.$message({
                type: "error",
                message: res.message
              });
            }
          }
        });
      } else {
        $.ajax({
          url: "http://192.168.3.77:3000/api/demo/update",
          method: "post",
          data: this.dialogFormData,
          dataType: "json",
          success: res => {
            console.log(res);
            if (res.data) {
              this.$message({
                type: "success",
                message: res.message
              });

              console.log(this.$refs);

              for (let key in this.dialogFormData) {
                this.dialogFormData[key] = "";
              }

              this.dialogVisible = false;
              this.fetch();
            } else {
              this.$message({
                type: "error",
                message: res.message
              });
            }
          }
        });
      }
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
