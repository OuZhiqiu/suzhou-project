<template>
  <div>
    这是comm1

    <button @click="get">获取store</button>
    <button @click="add">向store中添加商品</button>

    <router-link to="/comm2">to-comm2</router-link>
    <router-link to="/shopingCar">to-shopingCar</router-link>
  </div>
</template>

<script>
export default {
  mounted() {},
  methods: {
    get() {
      console.log(this.$store.state);
    },
    add() {
      this.$store.commit("addShop", {
        goodsName: "javascript",
        price: "100",
        count: 1
      });
    }
  }
};
</script>
