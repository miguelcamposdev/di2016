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
                  <th>Acciones</th>
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
                <tr id="<?=$est->id?>">
                  <th scope="row"><?=$est->id?></th>
                  <td><?=$est->nombre?></td>
                  <td><?=$est->apellidos?></td>
                  <td><?=$est->telefono?></td>
                  <td><a href="<?php echo site_url('students/edit/'.$est->id); ?>">Editar otra pág.</a>
                    <button type="button" class="btn btn-primary btn-lg btn-editar" data-toggle="modal" data-target="#myModal">
                        Editar
                      </button>
                    </td>
                </tr>
                <?php } ?>
            </tbody>
            </table>
        </div>
    </div>
    <!-- /.row -->

    <!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body" id="contenido-modal">

      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
