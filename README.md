# Number-Formatter
A library to help transform Strings of numbers and digits into various formats including bizarre date time types requested by bizarre clients. By clients I mean customers!

If you are like me and want a project with which to help you are welcome. My email is dansteward@gmail.com

This idea started from work I was doing for a customer. The customer had other customers and each party had different ideas about what format the date/time should look like. So I needed to transform a date-time into about 5 different formats. For example, from one source the program would receive something like this “201807251237” and from a different source like this “2018-07-25-1237” but it needed to be presented in the GUI like this “2018-07-25 1237”.

I had to decide how I wanted to store it in the DB (I hadn’t worked with DBs and Spring etc by this point and wanted to keep it simple) so I kept it to simple Strings. And then I needed to use DT libraries in the program so needed to keep changing the format of the DT.
It was a simple project so I kept it simple and used the standard Java libraries mostly. I realise the code is basic. Part of the idea of this project is to expand and improve the code base. Java 8 needs to replace much of the code I think. I am open to ideas.

This is my first repository and I am doing it mainly as I can't find enough projects with which to get involved. I am a relative newbie to GH so please, if you are experienced at this, feel free to advise.

Please let me know! I’m dansteward@gmail.com if you are interested.

