<template>
  <v-menu open-on-focus>
    <template v-slot:activator="{ props }">
      <v-text-field v-bind="props" clearable />
    </template>
    <p>content</p>
  </v-menu>
</template>

<script setup>
  //
</script>
