<template>
  <div>
    <el-form
      :model="formData"
      ref="form"
      :rules="formRules"
      label-width="80px"
      :inline="false"
      size="normal"
    >
      <el-form-item label="用户名" prop="userName">
        <el-input v-model="formData.userName"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input v-model="formData.password" type="password"></el-input>
      </el-form-item>
      <el-form-item label="性别" prop="sex">
        <el-radio v-model="formData.sex" label="1">男</el-radio>
        <el-radio v-model="formData.sex" label="0">女</el-radio>
      </el-form-item>
      <el-form-item label="籍贯" prop="address">
        <el-select v-model="formData.address" clearable>
          <el-option
            v-for="(item, index) in options"
            :key="index"
            :label="item.label"
            :value="item.value"
          >
          </el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="爱好" prop="loveList">
        <el-checkbox-group v-model="formData.loveList">
          <el-checkbox
            v-for="(item, index) in loveLists"
            :key="index"
            :label="item.label"
          >
            {{ item.value }}
          </el-checkbox>
        </el-checkbox-group>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">提交</el-button>
        <el-button>重置</el-button>
      </el-form-item>
    </el-form>
    {{ formData }}
  </div>
</template>

<script>
export default {
  data() {
    return {
      formData: {
        loveList: []
      },
      options: [
        { label: "北京", value: 1 },
        { label: "上海", value: 2 },
        { label: "湖南", value: 3 },
        { label: "苏州", value: 4 }
      ],
      loveLists: [
        { label: "1", value: "篮球" },
        { label: "2", value: "羽毛球" },
        { label: "3", value: "乒乓球" },
        { label: "4", value: "打代码" }
      ],
      formRules: {
        userName: [
          { required: true, message: "请输入用户名", trigger: "change" }
        ],
        password: [
          { required: true, message: "请输入密码", trigger: "change" }
        ],
        sex: [{ required: true, message: "请选择性别", trigger: "change" }],
        address: [{ required: true, message: "请选择籍贯", trigger: "change" }],
        loveList: [{ required: true, message: "请选择爱好", trigger: "change" }]
      }
    };
  },
  methods: {
    onSubmit() {
      this.$refs.form.validate(item => {
        if (item) {
          alert("submit!");
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    }
  }
};
</script>
