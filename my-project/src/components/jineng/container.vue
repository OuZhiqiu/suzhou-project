<template>
  <div class="container">
    <div
      class="page-title"
      :style="{ 'justify-content': btnVisible ? 'space-between ' : 'center' }"
    >
      <span class="goBack" v-show="btnVisible" @click="goBack">返回</span>
      <span>文章管理</span>
      <span class="save" v-show="btnVisible" @click="save">保存</span>
    </div>

    <ul class="page-tab">
      <li
        v-for="(item, index) in tabList"
        :key="index"
        @click="tabClick(index)"
        :class="{ active: currenTab === index }"
      >
        {{ item }}
      </li>
    </ul>

    <router-view></router-view>

    <ul class="footer">
      <li>
        <div class="icon"></div>
        <div>文章管理</div>
      </li>
      <li>
        <div class="icon"></div>
        <div>文章管理</div>
      </li>
      <li>
        <div class="icon"></div>
        <div>文章管理</div>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tabList: ["文章列表", "文章编写", "文章分类"],
      currenTab: 0,
      btnVisible: false
    };
  },
  methods: {
    goBack() {
      this.$router.go(-1);
    },
    save() {
      this.$router.go(-1);
    },
    tabClick(index) {
      this.currenTab = index;
    }
  },
  watch: {
    $route(route) {
      // console.log(route);
      if (route.path === "/detail") {
        this.btnVisible = true;
      } else {
        this.btnVisible = false;
      }
    }
  }
};
</script>

<style scoped>
.container-list {
  flex: 1;
  margin-top: 80px;
  margin-bottom: 60px;
}

.container {
  display: flex;
  flex-direction: column;
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
}

.container .page-title {
  z-index: 1;
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: fixed;
  top: 0;
  left: 0;
  color: #ffffff;
  background: rgb(100, 108, 252);
  width: 100%;
  height: 40px;
  line-height: 40px;
  text-align: center;
  z-index: 1;
  padding: 0 10px;
  box-sizing: border-box;
}

.container .page-title span.goBack {
  color: #ffffff;
  border: 2px solid #aaa;
  border-radius: 20px;
  height: 30px;
  line-height: 30px;
  padding: 0 10px;
}

.container .page-title span.save {
  color: #ffffff;
  border: 2px solid #aaa;
  border-radius: 20px;
  height: 30px;
  line-height: 30px;
  padding: 0 10px;
}

.container .page-tab {
  position: fixed;
  top: 40px;
  left: 0;
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  background: #ffffff;
  border-top: 1px solid #ddd;
  border-bottom: 1px solid rgb(100, 108, 252);
  z-index: 1;
}

.container .page-tab li {
  flex: 1;
  height: 40px;
  line-height: 40px;
  text-align: center;
  font-size: 14px;
}

.container .page-tab li.active {
  background: rgb(100, 108, 252);
  color: #fff;
  font-weight: bold;
}

.container .page-tab li:nth-child(2) {
  border-left: 1px solid #ddd;
  border-right: 1px solid #ddd;
}

.container .footer {
  position: fixed;
  bottom: 0;
  left: 0;
  display: flex;
  width: 100%;
  height: 60px;
  background: rgb(100, 108, 252);
  color: #ffffff;
  font-size: 12px;
  font-weight: bold;
}

.container .footer li {
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  align-items: center;
}

.container .footer li .icon {
  width: 25px;
  height: 25px;
  background: #aaaaaa;
  border-radius: 50%;
}

.container .footer li:first-child .icon {
  width: 25px;
  height: 25px;
  border-radius: 50%;
  background-image: url("./images/icons-36-white.png");
  background-position: -867px -5px;
}

.container .footer li:nth-child(2) .icon {
  width: 25px;
  height: 25px;
  border-radius: 50%;
  background-image: url("./images/icons-36-white.png");
  background-position: -939px -5px;
}

.container .footer li:last-child .icon {
  width: 25px;
  height: 25px;
  border-radius: 50%;
  background-image: url("./images/icons-36-white.png");
  background-position: -580.5px -5px;
}
</style>
