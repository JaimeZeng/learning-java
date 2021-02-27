function init() {
    let monitor = document.getElementById("monitor");
    monitor.value = 0;
    monitor.disabled;
    // let num1 = document.getElementById("num1");
    // num1.onclick = function () {
    //     alert(num1.value);
    // }
    let objButton = document.getElementsByTagName("input");
    for (let objButtonKey in objButton) {
        objButton[objButtonKey].onclick = function () {
            // if (!isNaN(this.value)){
            if (isNumber(this.value)) {
                console.log(this.value);
            } else {
                console.log("非数字~");
            }
        }
    }
}

// function num1_click() {
//     let monitor = document.getElementById("monitor");
//     let values = monitor.value;
//     values = (values === "0") ? "1" : (values + "1");
//     document.getElementById("monitor").value = values;
// }
//
// function num2_click() {
//     let monitor = document.getElementById("monitor");
//     let values = monitor.value;
//     values = (values === "0") ? " " : values;
//     values += "2";
//     document.getElementById("monitor").value = values;
// }
//
// function num3_click() {
//     let monitor = document.getElementById("monitor");
//     let values = monitor.value;
//     values += "3";
//     document.getElementById("monitor").value = values * 1;
// }

/**
 * 判断输入的是否为数字，如果是数字则返回 true, 否则返回 false
 * @param num 输入的数字
 * @returns {boolean} 如果是数字则返回 true, 否则返回 false
 */
function isNumber(num) {
    // return (!isNaN(num) ? true : false);
    return (!isNaN(num));
}