import type {UserConfig, DefaultThemeOptions} from "vuepress";
import {navbar, sidebar} from "./configs";

const config: UserConfig<DefaultThemeOptions> = {
    base: "/",
    lang: "zh-CN",
    title: "learning-java",
    description: "learning-java",
    head: [
        [
            "link",
            {
                rel: "icon",
                type: "image/png",
                sizes: "16x16",
                href: `/images/icons/favicon-16x16.png`,
            },
        ],
        [
            "link",
            {
                rel: "icon",
                type: "image/png",
                sizes: "32x32",
                href: `/images/icons/favicon-32x32.png`,
            },
        ],
        ["link", {rel: "manifest", href: "/manifest.webmanifest"}],
        ["meta", {name: "application-name", content: "Jaime"}],
        ["meta", {name: "apple-mobile-web-app-title", content: "Jaime"}],
        [
            "meta",
            {name: "apple-mobile-web-app-status-bar-style", content: "black"},
        ],
        [
            "link",
            {rel: "apple-touch-icon", href: `/images/icons/apple-touch-icon.png`},
        ],
        [
            "link",
            {
                rel: "mask-icon",
                href: "/images/icons/safari-pinned-tab.svg",
                color: "#ffffff",
            },
        ],
        ["meta", {name: "msapplication-TileColor", content: "#ffffff"}],
        ["meta", {name: "theme-color", content: "#ffffff"}],
    ],
    themeConfig: {
        home: "/",
        logo: "/images/logo.png",
        navbar: navbar.zh,
        // sidebar: sidebar.zh,
        repo: "JaimeZeng/learning-java",
        editLink: false,
        editLinkText: "Edit this page",
        docsRepo: "https://github.com/JaimeZeng/learning-java",
        docsBranch: "main",
        docsDir: "docs",
        editLinkPattern: ":repo/-/edit/:branch/:path",
        lastUpdated: false,
        lastUpdatedText: "Last Updated",
        contributors: false,
        contributorsText: "Contributors",
        tip: "TIP",
        warning: "WARNING",
        danger: "WARNING",
        notFound: [
            "这里什么都没有",
            "我们怎么到这来了？",
            "这是一个 404 页面",
            "看起来我们进入了错误的链接",
        ],
        backToHome: "Back to home",
        openInNewWindow: "open in new window",
        themePlugins: {
            git: process.env.NODE_ENV === "production",
            // themePlugins.activeHeaderLinks: true,
            // themePlugins.backToTop: true,
            // themePlugins.git: true,
            // themePlugins.mediumZoom: true,
            // themePlugins.nprogress: true,
        },
    },
    plugins: [
        ["@vuepress/plugin-active-header-links"],
        ["@vuepress/plugin-back-to-top"],
        ["@vuepress/plugin-container"],
        ["@vuepress/plugin-git"],
        ["@vuepress/plugin-medium-zoom"],
        ["@vuepress/plugin-nprogress"],
        // ["@vuepress/plugin-pwa"],
    ],
};

export = config;
