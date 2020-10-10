<template>
  <div>
    <h2>这是a.vue文件</h2>
    <router-link to="/b">跳转到b页面</router-link><br />
    <button @click="toBCom">使用path跳转到b页面</button>
    <button @click="huoquB">获取b传递过来的参数</button>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {
    toBCom() {
      this.$router.push({
        path: "/b",
        query: { name: "a", age: "10", id: "123", height: "180" }
      });
    },
    huoquB() {
      console.log(this.$route.params);
    }
  }
};
</script>
