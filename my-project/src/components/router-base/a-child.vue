<template>
  <div class="box">
    <h3>这是子组件a-child</h3>
    {{ toChild }}

    <button @click="sendParent">a-child-click</button>
  </div>
</template>

<style>
.box {
  width: 200px;
  height: 200px;
  background: palegreen;
}
</style>

<script>
export default {
  name: "a-child",
  props: {
    toChild: {
      type: String,
      default: ""
    }
  },
  data() {
    return {};
  },
  methods: {
    sendParent() {
      this.$emit("child-parent-func", 666);
    }
  }
};
</script>
