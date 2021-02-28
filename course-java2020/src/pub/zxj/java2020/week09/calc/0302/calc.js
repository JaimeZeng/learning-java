function init() {
    let monitor = document.getElementById("monitor");
    monitor.value = 0;
    monitor.disabled;
    // let num1 = document.getElementById("num1");
    // num1.onclick = function () {
    //     alert(num1.value);
    // }
    let objButton = document.getElementsByTagName("input");
    let btn_values;
    let operator;
    for (let objButtonKey in objButton) {
        objButton[objButtonKey].onclick = function () {
            // if (!isNaN(this.value)){
            if (isNumber(this.value)) {
                // console.log(this.value);
                // monitor.value = (monitor.value + this.value) * 1;
                // if (monitor.value === "0" || monitor.value.length === 0) {
                if (isNull(monitor.value)) {
                    monitor.value = this.value;
                } else {
                    monitor.value += this.value;
                }
            } else {
                // console.log("非数字~");
                switch (this.value) {
                    case "+":
                        btn_values = Number(monitor.value);
                        monitor.value = 0;
                        operator = "+";
                        break;
                    case "-":
                        btn_values = Number(monitor.value);
                        monitor.value = 0;
                        operator = "-";
                        break;
                    case "*":
                        btn_values = Number(monitor.value);
                        monitor.value = 0;
                        operator = "*";
                        break;
                    case "/":
                        btn_values = Number(monitor.value);
                        monitor.value = 0;
                        operator = "/";
                        break;
                    case "%":
                        btn_values = Number(monitor.value);
                        monitor.value = 0;
                        operator = "%";
                        break;
                    case ".":
                        monitor.value = monitor_add_point(monitor.value);
                        break;
                    case "CE":
                        console.log("CE");
                        break;
                    case "DEL":
                        console.log("DEL");
                        break;
                    case "+/-":
                        console.log("+/-");
                        break;
                    case "=":
                        switch (operator) {
                            case "+":
                                monitor.value = btn_values + Number(monitor.value);
                                // console.log(btn_values);
                                break;
                            case "-":
                                monitor.value = btn_values - Number(monitor.value);
                                // console.log(btn_values);
                                break;
                            case "*":
                                monitor.value = btn_values * Number(monitor.value);
                                // console.log(btn_values);
                                break;
                            case "/":
                                // 除数为 0，结果直接为 0
                                monitor.value = (Number(monitor.value) === 0) ? 0 : btn_values / Number(monitor.value);
                                // console.log(btn_values);
                                break;
                            case "%":
                                monitor.value = btn_values % Number(monitor.value);
                                // console.log(btn_values);
                                break;
                        }
                        break;
                }
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

/**
 * 判断文本框内的数字，是否为空或为 0。如果是则返回 true，否则返回 false
 * @param num 文本框内的数字
 * @returns {boolean} 如果是则返回 true，否则返回 false
 */
function isNull(num) {
    // return (num === "0" || num.length === 0) ? true : false;
    return (num === "0" || num.length === 0);
}

/**
 * 给文本框内的数值添加小数点。如果原文本框内数值没有小数点则在原数值后添加小数点。反之直接返回原数值。
 * @param num 文本框内的数值
 * @returns {string|*} 如果原文本框内数值没有小数点则在原数值后添加小数点。反之直接返回原数值。
 */
function monitor_add_point(num) {
    return (num.indexOf(".") === -1) ? (num + ".") : num;
}