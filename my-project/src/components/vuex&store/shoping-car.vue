<template>
  <div>
    shoping-car

    <ul>
      <li v-for="(item, index) in shopList" :key="index">
        <span>{{ item.goodsName }}</span>
        <span>{{ item.price }}</span>
        <span>{{ item.count }}</span>
        <button @click="addCount(item)">数量+</button>
        <button @click="deleteCount(item)">数量-</button>
      </li>
      <li>
          总价：
      </li>
    </ul>

    <button @click="get">获取store</button>
    <router-link to="/comm1">to-comm1</router-link>
    <router-link to="/comm2">to-comm2</router-link>
  </div>
</template>

<script>
export default {
  computed: {
    shopList() {
      return this.$store.state.shopList;
    },
    goodsSum(){
        
    }
  },
  methods: {
    get() {
      console.log(this.$store.state.shopList);
    },
    addCount(item) {
      this.$store.commit("addCount", item);
    },
    deleteCount(item) {
      this.$store.commit("deleteCount", item);
    }
  }
};
</script>
