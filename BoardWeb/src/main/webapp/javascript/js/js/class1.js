//class1.js

//js에서는 객체는 data라고 보는 게 낫다.(이미 기능이 다 구현 되어있음
//ex)HTML,css...)

//밑이 그저 객체.(data)

const obj1 = {
    name: "Hong",
    age: 20,
    showInfo() {

        //`` > 이거 쓰면 변수 값 불러올 때 좀 더 쉬움.
        return `이름은${this.name} 이고 나이는 ${this.age} 입니다.`;
    }
}
console.log(obj1);

//class
class Member {
    constructor(name, age) {  //생성자.
        this.name = name;
        this.age = age;
    }
    titles = ['이름', '나이'];
    showTitle() {
        this.titles.forEach(item => {
            console.log(item);
        })
        return undefined;
    }
    showInfo() {
        return `이름은${this.name} 이고 나이는 ${this.age} 입니다.`;

    }
}

Member.prototype.showName = function () {
    return `이름은${this.name} 입니다`;
}
const obj2 = new Member('홍길동', 20);
console.log(obj2.showName());
