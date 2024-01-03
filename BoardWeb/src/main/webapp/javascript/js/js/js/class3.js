//class3.js

/**const ary = []
ary.push(1)
ary.push(2)
console.log(ary.find(item => {
    return item == 2; // (find라는 met)조건식에 만족되는 첫번째 값을 새로운 배열에 담아줌.
}))*/




//1. 객체 : this는 객체 자신.
//2. function() this는 전역객체(window);

//window > 제일 상위 객체.
function myFunc() {
    console.log(this);
}
myFunc();

let obj = {}
obj.act = function () {
    this.value = 'default value'; //객체에 value 변수 값 설정.

    function innerAct() {
        this.value = 'innerAct value';
        console.log("this.value:" + this.value);
    }

    function innerReact(caller) {
        caller.value = "innerReact value";
        console.log("this.value" + this.value);
        console.log("caller.value: " + caller.value);
    }

    innerAct();

    console.log("obj 객체의 this.value" + this.value);

    innerReact(this);
    console.log("obj 객체의 this.value" + this.value);



}

obj.act();


//window.location.href = "https//www.daum.net";


//>>window는 제일 상위 객체다! 이거만 기억.

//https://bigtop.tistory.com/48



//클로저.


function outerFunc(name) {

    let saying = name + '안녕!';


    return function () {
        return saying;
    }
}


const closure1 = outerFunc('라이언 ');
const closure2 = outerFunc('콘 ');
console.log(closure1());
console.log(closure2());


function getCounter() {
    let cnt = 1;
    return function () {
        cnt++;
        console.log(cnt);
    }
    //increaseCounter();
}
const clo1 = getCounter();
clo1();
clo1();
clo1();

class Estimate {
    constructor(param) {
        this.unit = param;
    }//end of constructor

    //견적가 얻기 메서드
    getEstimate(unittype, width, height) {
        let priceinfo = this.unit.find(item => item.type == unittype);
        return priceinfo.price * width * height;
    }
    //배열에 요소 추가.
    addUnit(unit) {
        unit.push(unit);
    }

}//class end 
let unitinfo = [{ type: "wood", price: 100 }, { type: "iron", price: 300 }, { type: "plastic", price: 200 }];
const estimator = new Estimate(unitinfo);
let result = estimator.getEstimate('wood', 20, 20);
console.log(result);

