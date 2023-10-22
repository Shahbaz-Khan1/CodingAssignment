
let str = "Welcome to javaScript";
let reverse = "";
for(let i=str.length-1;i>=0;i--)
{
   reverse +=str[i];
}

let str1 = reverse.split(" ");
let reverse1="";
for(let j=str1.length-1;j>=0;j--){
    reverse1 += str1[j] + " ";
}
console.log(reverse1);
