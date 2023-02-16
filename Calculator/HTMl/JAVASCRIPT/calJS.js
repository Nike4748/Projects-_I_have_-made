
let display = document.getElementById("screen")
function allclear() {
    display.value = ""
}
function show(n) {
    display.value = display.value + n
}
function cal() {
    display.value = eval(display.value)
}
