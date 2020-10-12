<template>
  <div class="container-list">
    <div class="search-box">
      <div class="input-icon"></div>
      <input type="text" v-model="inpValue" @keyup.enter="search" />
    </div>

    <ul class="content-box">
      <li
        v-for="(item, index) in newContentData"
        :key="index"
        v-on:click="toDetail(item)"
      >
        <div class="title">{{ item.title }}</div>
        <div>{{ item.userName }} 发布于：{{ item.updateTime }}</div>
        <div class="item-icon"></div>
      </li>
    </ul>
  </div>
</template>

<script>
import { contentData, detailList } from "./data/data.js";
//使用import调用数据时，需要在数据中用export将数据暴露出来，才可使用

export default {
  data() {
    return {
      inpValue: "",
      newContentData: contentData
    };
  },
  methods: {
    search() {
      this.newContentData = contentData.filter(item => {
        return item.title.includes(this.inpValue);
      });
    },
    toDetail(data) {
      let datailData = detailList.filter(item => {
        return item.detailId === data.id;
      })[0];
      this.$router.push({
        path: "/detail",
        query: Object.assign({}, datailData, data)
      });
    }
  }
};
</script>

<style scoped>
.container-list .search-box {
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 40px;
  background: #aaaaaa;
}

.container-list .search-box .input-icon {
  position: absolute;
  top: 50%;
  left: 20px;
  width: 25px;
  height: 25px;
  margin-top: -12.5px;
  background: #ddd;
  border-radius: 50%;
  background-image: url("./images/icons-36-white.png");
  background-position: -1225px -5px;
}

.container-list .search-box input {
  box-sizing: border-box;
  width: 95%;
  height: 35px;
  border-top-left-radius: 20px;
  border-top-right-radius: 20px;
  border-bottom-left-radius: 20px;
  border-bottom-right-radius: 20px;
  outline: none;
  border: 2px solid #333333;
  padding-left: 40px;
}

.container-list .content-box {
  width: 100%;
  flex: 1;
  overflow: auto;
}

.container-list .content-box li {
  position: relative;
  width: 100%;
  height: 80px;
  border-bottom: 1px solid #ddd;
  padding: 0 20px;
  box-sizing: border-box;
}

.container-list .content-box li .item-icon {
  position: absolute;
  top: 50%;
  right: 20px;
  width: 25px;
  height: 25px;
  margin-top: -12.5px;
  background: #aaaaaa;
  border-radius: 50%;
  background-image: url("./images/icons-36-white.png");
  background-position: -220px -5px;
}

.container-list .content-box li .title {
  font-weight: bold;
  height: 40px;
  line-height: 40px;
}
</style>
