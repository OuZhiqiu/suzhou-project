<template>
  <div>
    <h2>这是b.vue文件</h2>
    <router-link to="/a">跳转到a页面</router-link><br />
    <button @click="toACom">使用name跳转到a页面</button>
    <button @click="huoquA">获取a传递过来的参数</button>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {
    toACom() {
      this.$router.push({
        name: "a",
        params: { name: "b", age: "18", id: "321", height: "175" }
      });
    },
    huoquA() {
      console.log(this.$route.query);
    }
  }
};
</script>
