<!-- Page Content -->
<div class="container">

    <!-- Portfolio Item Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Listado estudiantes</h1>
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Id</th>
                  <th>Nombre</th>
                  <th>Apellidos</th>
                  <th>Teléfono</th>
                </tr>
            </thead>
            <tbody>
                <!--
                  Como a esta vista, le hemos pasado un array
                  $datos_cuerpo, que dentro tiene una variable
                  'estudiantes' que tiene el resultado de
                  haber obtenido mediante el modelo SELECT * FROM Estudiantes

                  La forma que tenemos de acceder a la variable
                  'estudiantes' es $estudiantes

                -->
                <?php foreach($estudiantes as $est) { ?>
                <tr>
                  <th scope="row"><?=$est->id?></th>
                  <td><?=$est->nombre?></td>
                  <td><?=$est->apellidos?></td>
                  <td><?=$est->telefono?></td>
                </tr>
                <?php } ?>
            </tbody>
            </table>
        </div>
    </div>
    <!-- /.row -->
