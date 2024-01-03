//class4.js

const friend = {
    name: "송강",
    age: 31,
    hobbies: ['거울 보기', '운동', '영화 촬영'],
    pets: [{ name: '야옹이', gender: 'M', friends:['검양이','빨양이','핑양이','흰양이']}, { name: '멍멍이', gender: 'F' }],
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


friend.ages = 20;

friend.showFriends = function(){
    //this = friend를 가르키는데 ........이해 불가임..;;;;;
    console.log(this);
}
console.log(friend);

