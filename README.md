# Bootcamp 2017 #3 - Java Fundamental

## Java is OOP class based

Java adalah bahasa pemograman yang mewajibkan dibungkus dengan `class`, selain itu di Java adalah pre-compiled artinya semua `source code` java harus di compile dahulu sebelum di `run`. Java bahasa yang membedakan huruf besar dan kecil (case sensitive) ```sayHalo``` != ```SayHalo``` jadi berhati-hatilah!.

## How to compile and run it

Tools untuk melakukan compile java ```javac``` contohnya seperti berikut

```sh
javac path/java/src/File.java
```

Tools untuk menjalakan aplikasi java dengan perintah `java`

```sh
java -cp path/java/src package.location.File
```

## Variable

Pada dasarnya semua bahasa pemograman memiliki fitur ini yaitu variable, variabel digunakan untuk menampung data yang memiliki lifecycle dalam memory komputer.

## Tipe data

Tipe data di Java, sama seperti pendahulunya yaitu `C` tetapi secara explisite dibadakan seperti tidak ada lagi `char[]` saat ini diganti dengan `java.lang.String`. tipe data di Java terdiri dari 

### Primive data type

- `int`
- `float`
- `boolean`
- `double`
- `char`

### Modern

- `Integer` digunakan untuk menyimpan bilangan bulat contoh `1`, `-2`, `-35` dan seterusnya.
- `Float` digunakan untuk meyimpan bilangan pecahan contoh `0.25`, `-25.1` dan seterusnya.
- `Double` sama dengan tipe data `Float` hanya dapat menampung lebih besar nilainya.
- `Boolean` digunakan untuk menyimpan data `true` atau `false`
- `Character` digunakan untuk menyimpan data character contoh `'A'`
- `String`digunakan untuk mnyimpan data character dengan jumlah yang banyak contoh `"ABC"`

## Class & Interface

Class ....

Interface ...

## Struktur Kendali / Structure Controll

Struktur kendali terdiri dari 2 yaitu percabangan dan perulangan seperti berikut:

### Percabangan / Selection

- ```if (el_1) {//statement} else if (el_2) {//statement} else {//statement}```
- ```switch(param) case param_el : statement; break; default : statement;```

### Perulangan / Looping

- ```for(var; controls; iteration;){//statement}```
- ```do{ //statement } while(control);```
- ```while(contol){//statement}```

## Object Oriented Programming

- `extends` (Inheritances)
- `override` & `overload` (Polymorphism)
- `private` (Encapsulation)

## Array / Element Collections

- `java.util.Arrays`
- `java.util.List`
- `java.util.Map`
- `java.util.Set`

