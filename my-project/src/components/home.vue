<template>
  <div>
    <div class="home"><h1>这是home页</h1></div>
    <router-view></router-view>
  </div>
</template>

<style>
.home {
  background: pink;
  height: 50px;
}
</style>

<script>
export default {
  data() {
    return {};
  },
  methods: {}
};
</script>
