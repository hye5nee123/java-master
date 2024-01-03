//function5.js

//Array.prototype.forEach();
const ary = ['a', 'b', 'c']
ary.forEach(function (elem) {
    console.log(elem);
})
//  == ary.forEach( elem =>     console.log(elem));

//매개변수가 2개 이상일 때는 못 줄인다
ary.forEach((elem, idx) => {
    if (idx > 0) {
        console.log(elem);
    }
})


//prototype은 따로 메모리 차지는 x 그저 참조할 뿐
Array.prototype.sum = function () {
    console.log(this);
    let result = 0;
    this.forEach(function (val) {
        result += val;
    })
}
const numbers = [1, 2, 3, 4];
console.log('sum:' + numbers.sum());
