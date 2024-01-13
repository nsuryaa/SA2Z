#include <bits/stdc++.h>

using namespace std;
//Functions are set of code which performs something for you
//Functions are used to modularise code
//Functions are used to increase readability
//Functions are used to use same code multiple times

// void --> doesnt return anything
// return
// parameterised
// non parameterised


// void printName(string name)
// {
//     cout << "hey " << name << endl;
// }
// int main()
// {
//     string name;
//     cin >> name;
//     printName(name);

//     string name2;
//     cin >> name2;
//     printName(name2);
//     return 0;
// }

// void sum(int num1,int num2)
// {
//     int num3 = num1 + num2;
//     cout<<num3;
// }

// int main()
// {
//     int num1,num2;
//     cin >> num1 >> num2;
//     // int num3 = num1 + num2;
//     // cout << num3 << endl;
//     sum(num1,num2);
//     return 0;
// }

// int maxx(int num1,int num2)
// {
//     if(num1 >= num2) return num1;
//     else return num2;
// }

// int main()
// {
//     int num1,num2;
//     cin >> num1 >> num2;
//     // int minimum = min(num1,num2);
//     int minimum = maxx(num1,num2);
//     cout << minimum;
//     return 0;
// }

// pass by value
// void doSomething(int num)
// {
//     cout << num << endl;
//     num += 5;
//     cout << num << endl;
//     num += 5;
//     cout << num << endl;
// }


// int main()
// {
//     int num = 10;
//     doSomething(num);
//     cout << num << endl;
//     return 0;
// }

// void doSomething(string s)
// {

//     s[0] = 't';
//     cout << s;
    

// }
// int main()
// {
//     string s = "raj";
//     doSomething(s);
//     cout << s << endl;
//     return 0;
// }
//pass by reference
// void doSomething(string &s)
// {

//     s[0] = 't';
//     cout << s;
    

// }
// int main()
// {
//     string s = "raj";
//     doSomething(s);
//     cout << s << endl;
//     return 0;
// }

// //IF we pass array array will go with reference.
// void doSomething(int arr[],int n)
// {
//     arr[0] += 100;
//     cout << "Value inside function: " << arr[0] << endl;

// }
// int main()
// {
//     int n = 5;
//     int arr[n];
//     for(int i=0;i<n;i=i+1)
//     {
//         cin >> arr[i];
//     }

//     doSomething(arr, n)

//     cout << "Value inside int main: " << arr[0] << endl;
//     return 0;

// }

// int main()
// {
//     int arr[5];
//     for(int i=0;i<=4;i=i + 1)
//     {
//         cout << i << endl;
//         cin >> arr[i];
//     }

//     for(int i = 0;i<=4;i = i + 1)
//     {
//         cout << arr[i] < " ";
//     }
// }