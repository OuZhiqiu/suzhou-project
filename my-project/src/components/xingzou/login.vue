<template>
  <div class="content">
    <div class="formBox">
      <div class="formTitle">请登录</div>
      <el-form :model="formData" ref="form" :rules="formRules">
        <el-form-item prop="userName">
          <el-input
            @keyup.native.enter="onLogin"
            v-model="formData.userName"
            placeholder="请输入用户名"
          ></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input
            @keyup.native.enter="onLogin"
            v-model="formData.password"
            type="password"
            placeholder="请输入密码"
          ></el-input>
        </el-form-item>
        <el-form-item>
          <el-button
            :loading="loginLoading"
            type="primary"
            @click="onLogin"
            class="btnLogin"
          >
            登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录
          </el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import $ from "jquery";

export default {
  data() {
    return {
      formData: {},
      formRules: {
        userName: [
          { required: true, message: "请输入用户名", trigger: "change" }
        ],
        password: [{ required: true, message: "请输入密码", trigger: "change" }]
      },
      loginLoading: false
    };
  },
  methods: {
    onLogin() {
      this.$refs.form.validate(item => {
        if (item) {
          this.loginLoading = true;

          $.ajax({
            url: "http://192.168.3.77:3000/api/demo/login",
            method: "post",
            data: this.formData,
            dataType: "json",
            success: data => {
              setTimeout(() => {
                this.loginLoading = false;
                console.log("data", data);
                if (data.data) {
                  this.$message({
                    type: "success",
                    message: data.message
                  });
                  this.$router.push({ path: "/userManage" });
                } else {
                  this.$message({
                    type: "error",
                    message: data.message
                  });
                }
              }, 500);
            }
          });
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    }
  }
};
</script>

<style scoped>
.content {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background: url("../../assets/images/login/u0.jpg");
  background-repeat: no-repeat;
  background-size: 100% 100%;
}
.formBox {
  width: 320px;
  height: 290px;
  background: rgba(255, 255, 255, 0.15);
  position: absolute;
  top: 50%;
  right: 100px;
  transform: translate(0, -60%);
  text-align: center;
  box-sizing: border-box;
  padding: 0 25px;
}
.formTitle {
  color: #ddd;
  font-size: 20px;
  font-weight: bold;
  margin: 30px 0 20px;
}
.btnLogin {
  width: 120px;
}
</style>
