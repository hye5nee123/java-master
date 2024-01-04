//class4.js

const friend = {
    name: "송강",
    age: 31,
    hobbies: ['거울 보기', '운동', '영화 촬영'],
    pets: [{ name: '야옹이', gender: 'M', friends: ['검양이', '빨양이', '핑양이', '흰양이'] }, { name: '멍멍이', gender: 'F' }],
    showHobby() {
        return `${this.hobbies[0]},${this.hobbies[1]},${this.hobbies[2]}`;
    }
}
console.log(friend.name);
console.log(friend.age);

console.log(friend.hobbies);

friend.pets[0]['friends'][4] = '얼룩양이';
console.log(friend['pets'][0]['friends'][2]);
//delete friend.age;


friend.ages = 20;    //>>속성 추가 방식 1

friend.showFriends = function () {
    //this = friend를 가르키는데 ........이해 불가임..;;;;;
    console.log(this);
}
console.log(friend);


//참조값을 복사.

//friend라는 주소값을 담겠다.(원값 or 참조값 바꾸면 둘다 바뀜!)

const fcopy = friend;
fcopy.age = 22;
console.log(fcopy)

//객체 복사.(결과 값만 복사하겠다.>원본은 변경 x )
/**const fcopy2 = Object.assign({}, friend);
fcopy2.age = 24;
console.log(fcopy2)*/



/**assign의 신기한 기능...새로운 객체를 만드는 건데 bloodType이라는 원본에 없는 key값도 생성 ㄱㄴ */
const fcopy2 = Object.assign({ bloodType: 'O' }, friend);
fcopy2.age = 24;
console.log(fcopy2)


//속성 추가. (getter 필요.)
Object.defineProperty(friend, 'height', {
    get: function () {
        return this._height;
    },
    set: function (value) {
        if(value <= 0 ){
            alert('error')
        }
        this._height = value;
        
    }
});
friend.height = 162;
console.log(friend.height);


