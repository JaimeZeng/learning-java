function show_menu() {
    let menu_title = document.getElementById("menu_title");
    let menu_list = document.getElementById("menu_list");
    let flag = true;
    menu_title.onclick = function () {
        let menu_list = document.getElementById("menu_list");
        if (flag) {
            menu_list.style.display = "block";
            flag = false;
        } else {
            menu_list.style.display = "none";
            flag = true;
        }
    }
    
    let menu =document.getElementById("menu");
    menu.onmouseleave = function () {
        menu_list.style.display = "none";
        flag = true;
    }
}