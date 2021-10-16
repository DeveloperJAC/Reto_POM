Feature: Como empleado administrativo
  necesito ingresar al sistema para buscar usuarios registrados
  con el fin de actualizar datos en el sistema

  Scenario: Inicio de sesion exitoso del administrativo
    Given que el empleado administrativo encuentre en la página web el formulario de ingreso
    When el empleado administrativo ingresa el usuario y password, da click en ingresar
    Then el sistema deberá iniciar sesion y dirigirlo al Home de la pagina web








  //Background:
    //Given que el empleado administrativo se encuentra en la página web de los ingresos de estudiantes

  //Scenario: Ingreso de un estudiante con los campos obligatorios.
  // When el empleado administrativo ingresa los campos obligatorios y confirma la acción
  // Then el sistema deberá mostrar por pantalla el registro del estudiante ingresado.

  //Scenario: Ingreso de un estudiante usando todos los campos.
  // When el empleado administrativo ingresa valores en todos los campos del formulario y confirma la acción
  //Then el sistema deberá mostrar por pantalla el registro del estudiante ingresado con todos los campos.

