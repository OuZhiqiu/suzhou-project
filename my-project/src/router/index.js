import Vue from "vue";
import Router from "vue-router";
import HelloWorld from "@/components/HelloWorld";
import A from "@/components/router-base/a.vue";
import B from "@/components/router-base/b.vue";
import NotPage from "@/components/404.vue";
import Home from "@/components/home.vue";

import Container from "@/components/jineng/container.vue";
import ContainerList from "@/components/jineng/container-list.vue";
import Detail from "@/components/jineng/detail.vue";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "*",
      name: "*",
      component: NotPage
    },
    {
      path: "/home",
      name: "home",
      component: Home,
      children: [
        {
          path: "/a",
          name: "a",
          component: A
        },
        {
          path: "/b",
          name: "b",
          component: B
        }
      ]
    },
    {
      path: "/",
      name: "HelloWorld",
      component: HelloWorld
    },
    {
      path: "/404",
      name: "404",
      component: NotPage
    },
    {
      path: "/container",
      name: "container",
      component: Container,
      children: [
        {
          path: "/container-list",
          name: "container-list",
          component: ContainerList
        },
        {
          path: "/detail",
          name: "detail",
          component: Detail
        }
      ]
    }
  ]
});
