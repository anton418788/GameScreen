# Информация о репозитории
Данный проект расчитан на отображение экранов типа "Просмотр приложения в магазине" под Android устройства (см. Системные Требования) в рамках лабораторной работы курса Effective 
## Что есть из вкусного?
1. Реализована система отображения колличества звездочек в зависимости от рейтинга игры (значение Double). При нецелом значении выполняется округление в ближайшую сторону (рейтинг равный 4.3 округляется до 4 и показывает 4 звезды)
2. Реализован скролл строчки с скриншотами (в будушем планируется добавить возможность открывать скриншот нажатием, а так же зациклить строчку)
3. Реализована кнопка, которая остается на месте при скролле экрана (не было уточнений, должна ли она оставаться в таком положении. Поэтому мной было принято логичное решение)
4. Так как все реализовано через поля, то, соответственно, нет никаких "костыльных" значений. Весь текст, картинки, рейтинг привязаны исключительно к объекту и не прописываются константами в методах.
5. Под каждый метод был прописан Review модуль, чтобы просмотреть контейнер отдельно от экрана
## Описание работы главного файла:
В главном файле ___MainActivity___ реазилуется функция "Запустить экран просмотра игры" (___ScreenInstall(game : Game)___). На вход метод принимает объект класса ___Game___. 
Объекты данного класса носят в себе поля "вариативных настроек" экрана (то бишь при смене значений этих полей меняется визуальное наполнение блоков).
Метод ___ScreenInstall___ в свою очередь хранит в себе всего один контейнер - LazyColumn, элементы которого определены как item. В каждом элементе под методами скрыты контейнеры (это реализовано, чтобы не захламлять главные файлы и в целом для убобства чтения и работы с кодом).
## Расположение файлов?
Директории разделены по назначению. В папке ___screen_forms___ предполагаются дополнительные папки экранов. Один из них - требуемый экран загрузки игры (папка ___ScreenInstall___). В ней содержится сам метод экрана, а так же отдельная папка с используемыми им методами (___functions___) и папка с играми (___Games___).
В папке ___Games___ хранятся различные игры, которые являются объектами класса ___Game___ с полями, которые в теории могут быть индивидуальными.
## Можно ли добавить другие игры?
Да. Алгоритм экрана построен таким образом, что все настройки контейнеров, которые не должны меняться при смене объектов, остаются внутри методов. Поэтому, чтобы добавить новый объект, достаточно просто его создать с нужными полями.
В файле реализации класса Game комментариями пояснены все поля, которые будут у объекта. Нужно лишь создать новый объект с заполненными под определенную игру полями и запустить экран (с параметром в виде объекта) в файле ___MainActivity___.

___К сожалению, нет общей реализации запуска экранов, то есть чтобы запустить один, нужно удалить все другие (планируется доработать)___.

## Системные требования:
___Android 7.0+___

## Было протестировано на устройствах:
Внутренний ___Review модуль Android Studio___
Эмулятор ___Pixel 5 API 24 Android 7.0___
Реальный мобильный телефон ___Realme 8i (Android 12)___

## Комментарий от себя:
Мной не была реализована полноценная копия "Доты" с фигмы, поскольку работоспособность контейнеров видно и по другим элементам. Упор был сделан на задачу "сделать экран загрузки игры", а не конкретно "экран загрузки Dota 2"
Проект не завершен и требует значительной доработки, чтобы иметь право называться проектом. Это будет исправляться в будущем.


