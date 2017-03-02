<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Listado estudiantes</title>
  </head>
  <body>
    <p>
        Estás en el listado de estudiantes / <?php echo random_string('alnum',20);?> 
    </p>
    <a href="<?php echo site_url('students/add'); ?>">Añadir nuevo estudiante</a>

  </body>
</html>
