<template>
  <div>
    <h2>这是a.vue文件</h2>
    <router-link to="/b">跳转到b页面</router-link><br />
    <button @click="toBCom">使用path跳转到b页面</button>
    <button @click="huoquB">获取b传递过来的参数</button>

    <a-child :toChild="text" @child-parent-func="child"></a-child>
    <p>
      vue父子组件之间的传值参考网页：https://www.jianshu.com/p/af9cb05bfbaf
    </p>
  </div>
</template>

<script>
import AChild from "./a-child.vue";

export default {
  components: {
    AChild
  },
  data() {
    return {
      text: "传入组件的内部参数"
    };
  },
  mounted() {
    console.log(this.$store.state);
  },
  methods: {
    child(data) {
      console.log(data);
    },

    getChildFunc(data) {
      console.log(data);
    },

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
