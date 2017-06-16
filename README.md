# GPIOControl
## 1.What is GPIOControl?
* It's a library, use Java language.

* It can use in Linux core system(Arm, x86_64 or i586).

* It can control your device on GPIO pin.

***

## 2.How to use it?
You can see all method on the JavaDoc.

I will tell you some way to use it.
***
### 2.1. How to construction a GPIOControl object?
```Java
 GPIOControl control = new GPIOControl(gpioNum);
 ```
 
You can construction a GPIOControl object like this.
***
There have a args, it's call "gpioNum", it's Int type, please fill out your GPIO index at here.
***
### 2.2. How to export my pin?
```Java
 control.export();
 ```

It can export your pin.

If your pin is exporting, it will break.
***
### 2.3. How to set mode?
```Java
 control.setMode(mode);
 ```

 Like that.

 There have a args, it's call "mode", it's String type, you can fill out "OUT" or "IN" at here.
***
### 2.4. How to set value?
```Java
 control.setValue(value);
 ```

 Like as that.

 There also have a args, it's call "value", it's Int type, you can fill out a value, such as 1, 0.
 > High is 1

 > Low is 0
***
### 2.5. How to unexport?
```Java
 control.unexport();
 ```

 It can unexport your pin.
 If your pin isn't exporting, it will break.
***
### 2.6. How to check my pin's export state?
```Java
 control.isExport();
 ```

 Like as it, this method will return a result, it's Boolean type, if it's export, will returning true, else, returning false.
***

## 3.Lisence
GPIOControl is using GNU/GPL lisence, so if you want to import it to your program, you need read the lisence.
***

## 4.About copy code
If you want copy my code to your code, I hope you can ask me in Issues. Using code isn't equals Copy code.
***

## 5.Thanks for
Thanks for RESBI's GPIO-lib-for-OrangePi project.
***

## Last
If you have some advices, you can tell me in Github's issues.

The project isn't complete, I am continually complete the code.