<template>
  <div class="user-container">
    <div class="search-box">
      <el-form :model="searchFormData" ref="form" label-width="80px" inline>
        <el-form-item label="用户名" prop="userName">
          <el-input
            v-model="searchFormData.userName"
            placeholder="请输入用户名"
          ></el-input>
        </el-form-item>
        <el-form-item label="用户账号" prop="userAccount">
          <el-input
            v-model="searchFormData.userAccount"
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
          <el-button type="primary">查询</el-button>
          <el-button type="primary" @click="reset">重置</el-button>
        </el-form-item>
      </el-form>
    </div>

    <div class="btn-group">
      <el-button>新增</el-button>
      <el-button>修改</el-button>
      <el-button>删除</el-button>
    </div>

    <el-table :data="tableData">
      <el-table-column label="账号" prop="account"></el-table-column>
      <el-table-column label="姓名" prop="name"></el-table-column>
      <el-table-column label="角色" prop="role"></el-table-column>
      <el-table-column label="性别" prop="gender"></el-table-column>
      <el-table-column label="手机" prop="phone"></el-table-column>
      <el-table-column label="邮箱" prop="email"></el-table-column>
      <el-table-column label="身份证" prop="idCard"></el-table-column>
    </el-table>

    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentPage"
      :page-sizes="[20, 40, 80, 100, 200]"
      :page-size="20"
      layout="total, sizes, prev, pager, next, jumper"
      :total="200"
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
      currentPage: 1,
      tableData: []
    };
  },
  mounted() {},
  methods: {
    reset() {
      this.$refs.form.resetFields();
    },
    handleSizeChange(item) {
      console.log("Size:" + item);
    },
    handleCurrentChange(item) {
      console.log("Current:" + item);
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
