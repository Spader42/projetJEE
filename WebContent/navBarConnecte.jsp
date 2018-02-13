<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="Content/Pictures/Logo.png" height="20" width="20">
      </a>
      <a class="navbar-brand" href="#">Météo Bretagne</a>
    </div>
    <div class="nav navbar-nav navbar-center">
        <li><a href="#Compte">{{pseudoUtilisateur}}</a></li>    
    </div>
    <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
      <form class="navbar-form">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Rechercher ville">
        </div>
        <button type="submit" class="btn btn-default">Rechercher</button>
      </form>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>