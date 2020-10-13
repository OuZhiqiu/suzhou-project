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

      <el-form-item>
        <el-button type="primary" @click="onSubmit">提交</el-button>
        <el-button>重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      formData: {
        loveList: []
      },
      options:[
          {label:'北京',value:1},
      ],
      formRules:{

      }
    };
  },
  methods:{
      onSubmit(){
          
      }
  }
};
</script>
