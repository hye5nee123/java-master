//array5.js

const ary = [12, 20, 2, 1, 100, 88];



ary.sort((a, b) => {
    //오름차순 : -1 내림차순: 1
    if (a > b) {
        return -1
    } else {
        return 1;
    }
});
//가나다 순으로 정렬.
ary.sort();
console.log(ary);





console.log("송강">"김민규");

const friends = [
    {name:"송강" ,age:12},
    {name:"서강준" ,age:111},
    {name:"차은우" ,age:2},
    {name:"김민규" ,age:33},


]
friends.sort((a,b) =>{
    if(a.age < b.age){
        return -1;
    }else{
        return 1;
    }
})
console.log(friends);
