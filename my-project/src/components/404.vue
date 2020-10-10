<template>
  <div>
    <button @click="goBut">返回上一个页面</button>
    <h1>404</h1>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {
    goBut() {
      this.$router.go(-1);
    }
  }
};
</script>
