<template>
  <mdb-container class="col-8 mt-4">
    <mdb-row>
      <div class="card testimonial-ca rd autocomplete" v-for="folder in folderStructure">
        <div class="card-body">
          <div>
            <button class="btn fas fa-info animated tada infinite"
                    v-on:click="updateFolder(folder)"></button>
            <button class="btn far fa-trash-alt animated tada infinite"
                    v-on:click="deleteFolderByFolderId(folder.id)"></button>
          </div>
          <div class="mt-2">
            <h4 class="far fa-folder fa-5x" v-on:click="getStructure(folder.id)"></h4>
            <h4 class=" mt-2 card-title"
                v-text="folder.name.slice(0, 8).concat('...')"
                v-on:click="getStructure(folder.id)"></h4>
          </div>
        </div>
      </div>
    </mdb-row>
  </mdb-container>
</template>

<script>
  import 'bootstrap-css-only/css/bootstrap.min.css';
  import 'mdbvue/build/css/mdb.css';
  import VueMaterial from 'vue-material'
  import 'vue-material/dist/vue-material.min.css'
  import {mapState, mapGetters, mapActions, mapMutations} from 'vuex';
  import {
    mdbContainer,
    mdbRow
  } from 'mdbvue';

  export default {
    name: "Folders",
    components: {
      mdbContainer,
      mdbRow
    },
    computed: {
      ...mapState([
        'folderStructure'
      ])
    },
    methods: {
      ...mapMutations([
        'setFolderId',
        'setFolder',
        'enableFolderUpdate'
      ]),
      ...mapActions([
        'retrieveStructureAndCategories',
        'deleteFolder',
      ]),
      getStructure(id) {
        this.setFolderId(id);
        this.retrieveStructureAndCategories();
      },
      updateFolder(folder) {
        this.setFolder(folder);
        this.enableFolderUpdate();
      },
      async deleteFolderByFolderId(folderId) {
        await this.deleteFolder(folderId);
        this.retrieveStructureAndCategories();
      },
    }
  }
</script>

<style scoped>

</style>
