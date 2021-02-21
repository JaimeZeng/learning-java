import type {NavbarConfig} from "vuepress";

export const zh: NavbarConfig = [
    {
        text: " Home",
        link: "/java2020/",
    },
    {
        text: "阶段一",
        children: [
            "/java2020/week01.md",
            "/java2020/week02.md",
            "/java2020/week03.md",
        ],
    },
];
