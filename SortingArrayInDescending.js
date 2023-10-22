
let arr =[10,2,50,25,5];
let temp=0;

for(let i=0;i<arr.length-1;i++)
{

    for(let j=0;j<arr.length-i-1;j++)
    {
        if(arr[j]<arr[j+1])
       {
        
        temp =arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;

       }
    }
}

    console.log(arr);