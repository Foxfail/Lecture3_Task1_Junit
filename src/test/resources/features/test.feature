#language: ru

Функция: Сложение двух чисел
  Командная строка должна спросить у пользователя первое число
  Командная строка должна спросить у пользователя второе число

  Предыстория:
    Допустим пользьватель запускает программу в консоли
    И программа выдает краткое описание функционала данной утилиты

  @correct
  Сценарий: Успешное сложение чисел
    Если пользователь вводит натуральное или вещественное число
    То программа складывает их
    И выводит результат на экран

  @fail
  Сценарий: Невозможно сложить
    Если пользователь вводит не число или комплексное число (что программа всё равно распознаст как строку)
    То программа выдает сообщение о некорректных введенных данных
