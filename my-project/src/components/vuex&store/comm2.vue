<template>
  <div>
    这是comm2

    <button @click="add">在comm2中添加商品</button>

    <router-link to="/comm1">to-comm1</router-link>
    <router-link to="/shopingCar">to-shopingCar</router-link>
  </div>
</template>

<script>
export default {
  mounted() {
    console.log(this.$store.state.car);
  },
  methods: {
    add() {
      this.$store.commit("addShop", {
        goodsName: "java",
        price: "10",
        count: 0
      });
    }
  }
};
</script>
