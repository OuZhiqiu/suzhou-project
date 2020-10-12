<template>
  <div>
    <div class="derail">
      <ul class="content-box">
        <li>
          <div>作者:</div>
          <input v-model="d().userName" id="auther" type="text" />
        </li>
        <li>
          <div>标题:</div>
          <input v-model="d().title" id="detailTitle" type="text" />
        </li>
        <li>
          <div>内容:</div>
          <textarea v-model="d().detailInfo" id="remark" name="" cols="30" rows="10"></textarea>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
    };
  },
  methods: {
    d() {
      return this.$route.query;
    }
  }
};
</script>

<style scoped>
.derail {
  display: flex;
  flex-direction: column;
  padding-top: 80px;
  padding-bottom: 60px;
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
}

.content-box {
  padding: 10px;
}

.content-box li {
  display: flex;
  flex-direction: column;
}

.content-box li > div {
  height: 30px;
  line-height: 30px;
  color: #333333;
}

.content-box li input {
  flex: 1;
  height: 30px;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
  border-bottom-left-radius: 10px;
  border-bottom-right-radius: 10px;
}

.content-box li textarea {
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
  border-bottom-left-radius: 10px;
  border-bottom-right-radius: 10px;
  outline: none;
}
</style>
