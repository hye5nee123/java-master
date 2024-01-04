//class6.js

function sum(num1, num2) {
    return num1 + num2;
}


function getMax(num1, num2) {
    return num1 > num2 ? num1 : num2;
}

//객체임.
const friend = {
    name: "hong",
    age: 20,
    showInfo() {
        return `이름은 ${this.name}이고 나이는  ${this.age}입니다.`
    }
}

export { friend, sum, getMax };
