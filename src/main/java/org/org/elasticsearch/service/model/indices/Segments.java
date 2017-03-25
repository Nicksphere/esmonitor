package org.org.elasticsearch.service.model.indices;

/**
 * Created by 835885 on 2016/12/6.
 */
public class Segments {
   private String count;
    private String memory_in_bytes;
    private String terms_memory_in_bytes;
    private String stored_fields_memory_in_bytes;
    private String term_vectors_memory_in_bytes;
    private String norms_memory_in_bytes;
    private String doc_values_memory_in_bytes;
    private String index_writer_memory_in_bytes;
    private String index_writer_max_memory_in_bytes;
    private String version_map_memory_in_bytes;
    private String fixed_bit_set_memory_in_bytes;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getMemory_in_bytes() {
        return memory_in_bytes;
    }

    public void setMemory_in_bytes(String memory_in_bytes) {
        this.memory_in_bytes = memory_in_bytes;
    }

    public String getTerms_memory_in_bytes() {
        return terms_memory_in_bytes;
    }

    public void setTerms_memory_in_bytes(String terms_memory_in_bytes) {
        this.terms_memory_in_bytes = terms_memory_in_bytes;
    }

    public String getStored_fields_memory_in_bytes() {
        return stored_fields_memory_in_bytes;
    }

    public void setStored_fields_memory_in_bytes(String stored_fields_memory_in_bytes) {
        this.stored_fields_memory_in_bytes = stored_fields_memory_in_bytes;
    }

    public String getTerm_vectors_memory_in_bytes() {
        return term_vectors_memory_in_bytes;
    }

    public void setTerm_vectors_memory_in_bytes(String term_vectors_memory_in_bytes) {
        this.term_vectors_memory_in_bytes = term_vectors_memory_in_bytes;
    }

    public String getNorms_memory_in_bytes() {
        return norms_memory_in_bytes;
    }

    public void setNorms_memory_in_bytes(String norms_memory_in_bytes) {
        this.norms_memory_in_bytes = norms_memory_in_bytes;
    }

    public String getDoc_values_memory_in_bytes() {
        return doc_values_memory_in_bytes;
    }

    public void setDoc_values_memory_in_bytes(String doc_values_memory_in_bytes) {
        this.doc_values_memory_in_bytes = doc_values_memory_in_bytes;
    }

    public String getIndex_writer_memory_in_bytes() {
        return index_writer_memory_in_bytes;
    }

    public void setIndex_writer_memory_in_bytes(String index_writer_memory_in_bytes) {
        this.index_writer_memory_in_bytes = index_writer_memory_in_bytes;
    }

    public String getIndex_writer_max_memory_in_bytes() {
        return index_writer_max_memory_in_bytes;
    }

    public void setIndex_writer_max_memory_in_bytes(String index_writer_max_memory_in_bytes) {
        this.index_writer_max_memory_in_bytes = index_writer_max_memory_in_bytes;
    }

    public String getVersion_map_memory_in_bytes() {
        return version_map_memory_in_bytes;
    }

    public void setVersion_map_memory_in_bytes(String version_map_memory_in_bytes) {
        this.version_map_memory_in_bytes = version_map_memory_in_bytes;
    }

    public String getFixed_bit_set_memory_in_bytes() {
        return fixed_bit_set_memory_in_bytes;
    }

    public void setFixed_bit_set_memory_in_bytes(String fixed_bit_set_memory_in_bytes) {
        this.fixed_bit_set_memory_in_bytes = fixed_bit_set_memory_in_bytes;
    }
}
