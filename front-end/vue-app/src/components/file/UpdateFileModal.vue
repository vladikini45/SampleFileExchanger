<template>

  <div class="container-fluid">
    <mdb-container>
      <mdb-modal v-if="enabledFileUpdate" @close="cancel" size="xl" class="text-center" dark>

        <mdb-modal-header center>
          <p class="heading">Are you sure you want to update information about the file?</p>
        </mdb-modal-header>

        <mdb-modal-body>
          <p>name:</p>
          <mdb-input size="sm" icon="fas fa-file-signature" required group type="text" v-model="newFile.realName"
                     v-bind:label="file.realName"/>
          <p>description:</p>
          <mdb-input size="sm" icon="fas fa-info" required group type="text" v-model="newFile.description"
                     v-bind:label="file.description"/>
          <p>date:</p>
          <mdb-input size="sm" icon="fas fa-clock" required group type="date" v-model="newFile.date"
                     v-bind:label="file.date"/>

        </mdb-modal-body>

        <mdb-modal-footer center>
          <mdb-btn outline="dark" @click="approve">Yes</mdb-btn>
          <mdb-btn color="dark" @click="cancel">No</mdb-btn>
        </mdb-modal-footer>

      </mdb-modal>
    </mdb-container>
  </div>

</template>
<script>
  import {mapState, mapGetters, mapMutations, mapActions} from 'vuex'
  import 'bootstrap-css-only/css/bootstrap.min.css';
  import 'mdbvue/build/css/mdb.css';
  import VueMaterial from 'vue-material'
  import 'vue-material/dist/vue-material.min.css'

  import {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbInput,
    mdbTextarea,
    mdbBtn,
    mdbIcon,
    mdbModal,
    mdbModalHeader,
    mdbModalBody,
    mdbModalFooter
  } from 'mdbvue';

  export default {
    name: "UpdateUser",
    components: {
      mdbContainer,
      mdbRow,
      mdbCol,
      mdbInput,
      mdbTextarea,
      mdbBtn,
      mdbIcon,
      mdbModal,
      mdbModalHeader,
      mdbModalBody,
      mdbModalFooter
    },
    data() {
      return {
        newFile: {
          realName: '',
          description: '',
          date: ''
        },
      };
    },
    computed: {
      ...mapState([
        'enabledFileUpdate',
        'file',
        'userSide',
        'adminSide'
      ]),
    },
    methods: {
      ...mapMutations([
        'destroyFile',
        'disableFileUpdate',
        'disableUserSide',
        'disableAdminSide'
      ]),
      ...mapActions([
        'updateFile',
        'retrieveFiles',
        'retrieveStructureAndCategories'
      ]),
      async approve() {
        let data = {
          id: this.file.id,
          realName: this.newFile.realName ? this.newFile.realName : this.file.realName,
          description: this.newFile.description ? this.newFile.description : this.file.description,
          date: this.newFile.date ? this.newFile.date : this.file.date,
        };
        await this.updateFile(data);
        this.retrieveInformation();
        this.destroyFile();
        this.disableFileUpdate();
      },
      cancel() {
        this.destroyFile();
        this.disableFileUpdate();
      },
      retrieveInformation() {
        if (this.userSide) {
          this.retrieveStructureAndCategories();
          this.disableUserSide();
        }
        if (this.adminSide) {
          this.retrieveFiles();
          this.disableAdminSide();
        }
      }
    }
  };
</script>

<style scoped>

</style>
