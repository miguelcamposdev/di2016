<!-- Page Content -->
<div class="container">

    <!-- Portfolio Item Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Editar estudiante</h1>
            <form action="<?=site_url('students/edit/'.$estudiante->id)?>" method="post">
  <div class="form-group">
    <label for="inputNombre">Nombre</label>
    <input type="text" class="form-control" id="inputNombre" name="inputNombre" placeholder="Nombre" value="<?=$estudiante->nombre?>">
  </div>
  <div class="form-group">
    <label for="inputApellidos">Apellidos</label>
    <input type="text" class="form-control" id="inputApellidos" name="inputApellidos" placeholder="Apellidos" value="<?=$estudiante->apellidos?>">
  </div>
  <div class="form-group">
    <label for="inputTelefono">Teléfono</label>
    <input type="phone" class="form-control" id="inputTelefono" name="inputTelefono" placeholder="Teléfono" value="<?=$estudiante->telefono?>">
  </div>
  <div class="form-group">
    <select name="selectCurso">
      <option value="">-Seleccione un curso-</option>
      <?php foreach($cursos as $curso) { ?>
      <option value="<?php echo $curso->id; ?>"><?php echo $curso->nombre; ?></option>
      <?php } ?>
    </select>
  </div>
  <input type="hidden" name="idE" id="idE" value="<?=$estudiante->id?>" />
  <button type="submit" class="btn btn-default">Guardar</button>
</form>
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
