//arrau4.js



let animals = [
    { species: 'mammalia', name: "cat" },
    { species: 'reptiles', name: "lizard" },
    { species: 'amphibia', name: "flog" },
    { species: 'mammalia', name: "dog" },
    { species: 'amphibia', name: "salamander" }
];


let result = animals.filter((value) => value.species == 'mammalia');

console.log(result);


const friends = [
    {
      name: '장효은',
      age: 28,
      job: '개발자',
      married: false,
    },
    {
      name: '조혜원',
      age: 28,
      job: '개발자',
      married: false,
    },
    {
      name: '서강준',
      age: 31,
      job: '2년차 유부남',
      married: true,
    }
  ];

  const happyPeople = friends.filter((friend) =>{

    return friend.married === false;})


    const str = '펭수, 라이언,어피치,콘,브라운,무지,라이언,어피치,콘';

    // 1.콘 이라는 이름은 몇번?



   let searchvalue = '콘';
    
    let pos = 0;

    while(true){
        let foundCon = str.indexOf(searchvalue,pos);
        if(foundCon == -1) break;
        console.log(foundCon);
        pos = foundCon +1;
    
     }


    
     //정규식임 외우는 게 좋음 !

     console.log('콘이름 횟수' + str.split(','.filter(name => name == '콘').length))
     console.log("콘 개수 :", str.match(/콘/g)?.length);


     console.log('콘')

     //이름이 3자 이상이 몇명?


     console.log('3자 이상' +str.split(','.filter))

     /**let spli = str.split(",");

     console.log(spli);*/

     /**for(var prop in spli){
        if([prop].length <=3 ){
            console.log(spli[prop])
        }else{
            console.log('no');
        }
     }*/

     //1. 문자열 배열로
     
     let words = str.split(',');
     console.log(words);
     console.log(words[0].length);
     let sum = 0;
     for(let i = 1;i <words.length;i++){
        if(words[i].length>=3){
                sum += words;
            
        } 
        console.log(sum);
     }

     /**function solution(words){
        var answer = [];
        for(let i = 0; i <words.length;i++){
           if(words.length <=3){
            answer.push(strList[i].length);
           }
        }
        return answer;

        console.log(answer)
     }*/

     //2.배열 길이 요소 사이즈가 3개 이상한 거 추출.
    




     //2자 이상이있는지 여부.




 




    