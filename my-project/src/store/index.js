import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

const store = new Vuex.Store({
  state: {
    car: "infinti",
    shopList: []
  },
  mutations: {
    addUserName(state, value) {
      console.log(value);
    },
    addShop(state, data) {
      state.shopList.push(data);
    },
    addCount(state, data) {
      let currentGoods = state.shopList.filter(item => {
        return item.goodsName === data.goodsName;
      })[0];
      currentGoods.count ++
    },
    deleteCount(state, data) {
      let currentGoods = state.shopList.filter(item => {
        return item.goodsName === data.goodsName;
      })[0];
      currentGoods.count --
    },
  }
});

export default store;
