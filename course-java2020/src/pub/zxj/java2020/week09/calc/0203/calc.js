function init() {
    let monitor = document.getElementById("monitor");
    monitor.value = 0;
    monitor.disabled;
}

function num1_click() {
    let monitor = document.getElementById("monitor");
    let values = monitor.value;
    values = (values === "0") ? "1" : (values + "1");
    document.getElementById("monitor").value = values;
}

function num2_click() {
    let monitor = document.getElementById("monitor");
    let values = monitor.value;
    values = (values === "0") ? " " : values;
    values += "2";
    document.getElementById("monitor").value = values;
}

function num3_click() {
    let monitor = document.getElementById("monitor");
    let values = monitor.value;
    values += "3";
    document.getElementById("monitor").value = values * 1;
}