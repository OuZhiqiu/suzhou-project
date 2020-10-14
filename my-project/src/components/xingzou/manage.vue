<template>
  <div>
    <el-container class="content">
      <el-header height="70px" class="title">Header</el-header>
      <el-container>
        <el-aside width="200px" class="nav">Aside</el-aside>
        <el-main> <router-view></router-view></el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
* {
  padding: 0;
}
.content {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background: rosybrown;
}
.content .title {
  background: paleturquoise;
}
.content .nav {
  background: khaki;
}
</style>
