<template>
  <div>
    <el-button>click</el-button>
    <el-input
      v-model="text"
      placeholder="Element快捷补全代码连接参考https://blog.csdn.net/HPFBoy/article/details/107837979"
    ></el-input>

    <el-table
      ref="myTable"
      :data="tableData"
      @selection-change="handleSelectionChange"
    >
      <el-table-column type="selection" width="50"></el-table-column>
      <el-table-column type="index" width="50"></el-table-column>
      <el-table-column label="名字" prop="name">
        <template slot-scope="scope">
          <el-button type="success" @click="clickName(scope.row)">{{
            scope.row.name
          }}</el-button>
        </template>
      </el-table-column>
      <el-table-column label="年龄" prop="age"></el-table-column>
      <el-table-column label="身高" prop="height"></el-table-column>
    </el-table>

    <el-button @click="changeTableChecked">切换选中状态</el-button>
    <el-button @click="clearRows">取消所有</el-button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tableData: [
        { name: "tom1", age: "10", height: "170" },
        { name: "tom2", age: "20", height: "175" },
        { name: "tom3", age: "30", height: "180" }
      ],
      text: ""
    };
  },
  methods: {
    handleSelectionChange() {},
    clickName(row) {
      console.log(row);
    },
    changeTableChecked() {},
    clearRows() {}
  }
};
</script>
