<template>
  <div class="content">
    <div class="form-box">
      <div>请登录</div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {}
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
.form-box{
  width: 300px;
  height: 300px;
  background: rgba(255, 255, 255, 0.15);
  position: absolute;
  top: 50%;
  right: 50px;
  transform: translate(0,-60%);
}
</style>
